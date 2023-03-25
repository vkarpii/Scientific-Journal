DROP USER IF EXISTS 'scserver'@'localhost';
CREATE USER 'scserver'@'localhost' IDENTIFIED BY 'NhduD2Yda5X2mt5mVJQV';
GRANT ALL PRIVILEGES ON scientific_journal.* TO 'scserver'@'localhost';
FLUSH PRIVILEGES;