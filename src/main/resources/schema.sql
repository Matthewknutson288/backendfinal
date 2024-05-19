DROP TABLE IF EXISTS Jointables;
DROP TABLE IF EXISTS genres;
DROP TABLE IF EXISTS game;
DROP TABLE IF EXISTS devs;

CREATE TABLE devs (
	devsid int NOT NULL AUTO_INCREMENT,
	square varchar(256) NOT NULL,
	nintendo varchar(128) NOT NULL,
	sega varchar(80) NOT NULL,
	PRIMARY KEY (devsid)
);

CREATE TABLE game (
	gameid int NOT NULL AUTO_INCREMENT,
	devsid int NOT NULL,
	Mario varchar(50) NOT NULL,
	Sonic varchar(50) NOT NULL,
	Zelda varchar(50) NOT NULL,
	FianlFantasy varchar(50) NOT NULL,
	Metroid varchar(50) NOT NULL,
	PRIMARY KEY(gameid),
	FOREIGN KEY (devsid) REFERENCES devs (devsid) ON DELETE CASCADE
);