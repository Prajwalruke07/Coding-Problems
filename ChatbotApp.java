import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

    public class ChatbotApp extends JFrame {
        public JTextField inputField;
        public JTextArea chatArea;

        private String[] responses = {
                "Hello! How can I help you?",
                "What's up?",
                "How can I assist you today?",
                "Nice to meet you! How can I be of service?",
                "Greetings! How may I assist you?",
                "Hey there! What can I do for you?",
                "Hi! What do you need help with?"


        };


        public ChatbotApp() {
            setTitle("Chatbot");
            setSize(400, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());

            chatArea = new JTextArea();
            chatArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(chatArea);
            add(scrollPane, BorderLayout.CENTER);

            inputField = new JTextField();
            inputField.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String userInput = inputField.getText();
                    appendToChat("You: " + userInput);
                    String response = generateResponse(userInput);
                    appendToChat("Chatbot: " + response);
                    inputField.setText("");
                }
            });
            add(inputField, BorderLayout.SOUTH);

            setVisible(true);
        }

        private void appendToChat(String message) {
            chatArea.append(message + "\n");

            setVisible(true);
        }

        private String generateResponse(String input) {
            // Simple responses for demonstration purposes
            if (input.contains("hello") || input.contains("hi"))
                return "Hello!";
            else if (input.contains("how are you"))
                return "I'm just a chatbot, but thank you for asking!";
            else if (input.contains("bye"))
                return "Goodbye! Have a great day!";
            else
                return getRandomResponse();
        }

        private String getRandomResponse() {
            Random rand = new Random();
            return responses[rand.nextInt(responses.length)];
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    new ChatbotApp();

                }
            });

        }
    }

