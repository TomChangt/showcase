CREATE TABLE users (
   id INT AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(255) NOT NULL,
   email VARCHAR(255) NOT NULL,
   birthday DATE
);
INSERT INTO users (name, email, birthday) VALUES
('John Doe', 'john.doe@example.com', '1990-01-01'),
('Jane Smith', 'jane.smith@example.com', '1985-05-15');