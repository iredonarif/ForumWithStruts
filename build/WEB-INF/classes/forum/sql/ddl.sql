DROP DATABASE IF EXISTS forum;

CREATE DATABASE forum;

\c forum

-------------Création des séquences-----------------------

CREATE SEQUENCE seq_id_personne;
	/*INCREMENT BY 1 
	MINVALUE 10 
	START 10;*/
CREATE SEQUENCE seq_id_categorie;

CREATE SEQUENCE seq_id_reponse;

CREATE SEQUENCE seq_id_question;


-------------- Création des tables-------------------------

CREATE TABLE Personne (
	id INTEGER PRIMARY KEY DEFAULT NEXTVAL('seq_id_personne'),
	nom VARCHAR,
	prenom VARCHAR,
	sexe VARCHAR,
	dateNaissance DATE,
	email VARCHAR
);

CREATE TABLE Categorie(
	id INTEGER PRIMARY KEY DEFAULT NEXTVAL('seq_id_categorie'),
	nom	VARCHAR
);

CREATE TABLE Question(
	id INTEGER PRIMARY KEY DEFAULT NEXTVAL('seq_id_question'),
	texte TEXT,
	dateQuestion DATE DEFAULT CURRENT_DATE,
	id_personne INTEGER REFERENCES Personne(id),
	id_categorie INTEGER REFERENCES Categorie(id)
);

CREATE TABLE Reponse(
	id_reponse INTEGER PRIMARY KEY DEFAULT NEXTVAL('seq_id_reponse'),
	texte TEXT,
	dateReponse DATE DEFAULT CURRENT_DATE,
	id_question INTEGER REFERENCES Question(id),
	id_personne INTEGER REFERENCES Personne(id)
);

--------Insertion des données dans la table Categorie----------------

INSERT INTO Categorie(nom) VALUES ('Administration'),
								  ('Technologies Web'),
								  ('Bases de Données'),
								  ('IRS'),
								  ('Mathématiques'),
								  ('Divers');

