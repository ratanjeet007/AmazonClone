
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AmazonClone extends JFrame {

    private JPanel productPanel, cartPanel;

    private DefaultListModel<String> cartModel;

    public AmazonClone() {

        setTitle("Amazon Clone");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(800, 600);
        setLayout(new BorderLayout());

        JLabel header = new JLabel("Welcome to Amazon Clone!", JLabel.CENTER);
        header.setFont(new Font("Arial", Font.BOLD, 24));
        add(header, BorderLayout.NORTH);

        productPanel = new JPanel(new GridLayout(0, 2, 10, 10));

        cartPanel = new JPanel();
        cartModel = new DefaultListModel<>();
        JList<String> cartList = new JList<>(cartModel);
        JScrollPane cartScroll = new JScrollPane(cartList);
        cartPanel.setLayout(new BorderLayout());
        cartPanel.add(new JLabel("Shopping Cart", JLabel.CENTER), BorderLayout.NORTH);
        cartPanel.add(cartScroll, BorderLayout.CENTER);

        JButton checkoutBtn = new JButton("Checkout");
        checkoutBtn.addActionListener(new CheckoutActionListener());
        cartPanel.add(checkoutBtn, BorderLayout.SOUTH);

        JScrollPane productScroll = new JScrollPane(productPanel);
        add(productScroll, BorderLayout.CENTER);
        add(cartPanel, BorderLayout.EAST);

        addProducts();

        setVisible(true);
    }


    private void addProducts() {
        String[] products = {"Laptop - $999", "Smartphone - $699", "Headphones - $199", "Camera - $499"};

        for (String product : products) {
            JPanel panel = new JPanel(new BorderLayout());
            JLabel name = new JLabel(product, JLabel.CENTER);

            JButton addBtn = new JButton("Add to Cart");
            addBtn.addActionListener(new AddToCartActionListener(product));

            panel.add(name, BorderLayout.CENTER);
            panel.add(addBtn, BorderLayout.SOUTH);
            panel.setBorder(BorderFactory.createLineBorder(Color.GRAY));

            productPanel.add(panel);
        }
    }


    private class CheckoutActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Calculate total cost
            double total = 0;
            for (int i = 0; i < cartModel.getSize(); i++) {
                String product = cartModel.get(i);
                String priceStr = product.split("-")[1].trim().substring(1); // Remove dollar sign
                double price = Double.parseDouble(priceStr);
                total += price;
            }

            JOptionPane.showMessageDialog(AmazonClone.this, "Checkout completed! Total: $" + String.format("%.2f", total));
        }
    }

    private class AddToCartActionListener implements ActionListener {
        private String product;

        public AddToCartActionListener(String product) {
            this.product = product;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // Add product to cart model
            cartModel.addElement(product);
        }
    }

    public static void main(String[] args) {
        // Run on Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AmazonClone();
            }
        });
    }
}


