CREATE TABLE IF NOT EXISTS category (
	id_category INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(50) NOT NULL CHECK (TRIM(name) <> '')
);

CREATE TABLE IF NOT EXISTS joke (
	id_joke INT AUTO_INCREMENT PRIMARY KEY,
	content VARCHAR(1000) NOT NULL CHECK (TRIM(content) <> ''),
	likes INT DEFAULT 0,
	dislikes INT DEFAULT 0,
	id_category INT NOT NULL,
	FOREIGN KEY (id_category) REFERENCES category(id_category)
);
