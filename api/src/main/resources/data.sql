/* 
    Init Players 
*/

INSERT INTO player (id,name) values(1,'Leroy')
INSERT INTO player (id,name) values(2,'JENKINS')

/*
    Init Category
*/

INSERT INTO category (id, name, image_path) values(1,"Attack", "")
INSERT INTO category (id, name, image_path) values(2,"Defense", "")
INSERT INTO category (id, name, image_path) values(3,"Magic", "")
INSERT INTO category (id, name, image_path) values(4,"Cooking", "")
INSERT INTO category (id, name, image_path) values(5,"Crafting", "")
insert into category (id, name, image_path) values(6,"Overall", "")

/*
    Init Scores
*/

/* Insert scores for player 1*/
INSERT INTO score (id, player_id, category_id, level, xp) values(1,1,1,99,31231231)
INSERT INTO score (id, player_id, category_id, level, xp) values(2,1,2,90,3311231)
INSERT INTO score (id, player_id, category_id, level, xp) values(3,1,3,99,2131311)
INSERT INTO score (id, player_id, category_id, level, xp) values(4,1,4,98,3123131)
INSERT INTO score (id, player_id, category_id, level, xp) values(5,1,5,54,31231)
INSERT INTO score (id, player_id, category_id, level, xp) values(6,1,6,539,3123131231231)

/* Insert scores for player 2*/
INSERT INTO score (id, player_id, category_id, level, xp) values(7,2,1,99,31231231)
INSERT INTO score (id, player_id, category_id, level, xp) values(8,2,2,90,3311231)
INSERT INTO score (id, player_id, category_id, level, xp) values(9,2,3,99,2131311)
INSERT INTO score (id, player_id, category_id, level, xp) values(10,2,4,98,3123131)
INSERT INTO score (id, player_id, category_id, level, xp) values(11,2,5,54,31231)
INSERT INTO score (id, player_id, category_id, level, xp) values(12,2,6,539,3123131231231)
