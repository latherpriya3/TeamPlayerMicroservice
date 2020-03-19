DROP TABLE IF EXISTS player;
DROP TABLE IF EXISTS team;

CREATE TABLE team (
  team_id INT NOT NULL,
  name VARCHAR(45) NOT NULL,
  country VARCHAR(45) NOT NULL,
  PRIMARY KEY (team_id));

CREATE TABLE player (
  player_id INT NOT NULL,
  name VARCHAR(45) NOT NULL,
  shirt_number INT NOT NULL,
  position VARCHAR(45) NOT NULL,
  team_id INT NOT NULL,
  PRIMARY KEY (player_id));

ALTER TABLE player 
ADD INDEX FK_TEAM_idx (team_id ASC);
ALTER TABLE player 
ADD CONSTRAINT FK_TEAM
  FOREIGN KEY (team_id)
  REFERENCES team (team_id)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;
    