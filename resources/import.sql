INSERT INTO team (team_id,  name, country) VALUES (1, 'Barcelona', 'Spanish');
INSERT INTO team (team_id,  name, country) VALUES (2, 'Manchester United', 'England');

INSERT INTO player(player_id, name, shirt_number, position, team_id) VALUES (1, 'Messi', 10, 'Forward',1);
INSERT INTO player(player_id, name, shirt_number, position, team_id) VALUES (2, 'Suarez', 9, 'Forward',1);
INSERT INTO player(player_id, name, shirt_number, position, team_id) VALUES (3, 'Philippe Coutinho', 14, 'Midfielder',1);

INSERT INTO player(player_id, name, shirt_number, position, team_id) VALUES (4, 'Pogba', 6, 'Midfielder',2);
INSERT INTO player(player_id, name, shirt_number, position, team_id) VALUES (5, 'De Gea', 1, 'Goal Keeper',2);

COMMIT;