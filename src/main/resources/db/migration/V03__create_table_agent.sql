CREATE TABLE agent(
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(50) NOT NULL,
	phone VARCHAR(20) NOT NULL,
	login VARCHAR(20) NOT NULL,
	password VARCHAR(20) NOT NULL,
	email VARCHAR(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8