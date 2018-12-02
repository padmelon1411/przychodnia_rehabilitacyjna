INSERT INTO patient (id,first_name,last_name) VALUES (1,'Patryk','Nowak');
INSERT INTO patient (id,first_name,last_name) VALUES (2,'Adam','Piekarski');
INSERT INTO patient (id,first_name,last_name) VALUES (3,'Matylda','Cisza');

INSERT INTO disease (id, name, date_of_starting_new_treatment, date_of_ending_new_treatment, patient_id) VALUES (1, 'Choroba stawu lewego', '2019-06-23', '2019-06-23', 1);
INSERT INTO disease (id, name, date_of_starting_new_treatment, date_of_ending_new_treatment, patient_id) VALUES (2, 'Bóle glowy przy pochylaniu','2019-07-20', '2019-08-05', 1);
INSERT INTO disease (id, name, date_of_starting_new_treatment, date_of_ending_new_treatment, patient_id) VALUES (3, 'Choroba stawu lewego', '2019-02-23', '2019-02-23', 2);

INSERT INTO physiotherapist (id,first_name,last_name) VALUES (1,'Adam','Nowak');
INSERT INTO physiotherapist (id,first_name,last_name) VALUES (2,'Juliusz','Slowacki');
INSERT INTO physiotherapist (id,first_name,last_name) VALUES (3,'Katarzyna','Nijaka');

INSERT INTO doctor_recommendation (id,name, id_disease) VALUES (1,'Cwiczenia czynne 10 x 10 min', 1);
INSERT INTO doctor_recommendation (id,name, id_disease) VALUES (2,'Podczerwien 10 x 15 min', 1);
INSERT INTO doctor_recommendation (id,name, id_disease) VALUES (3,'Krioterapia 5 x 10 min, a nastepnie 5 x 5 min',2);

INSERT INTO note (id, content_of_note, visit_id) VALUES (1, 'Dzisiaj pacjenta bolala bardzo glowa', 1);

INSERT INTO visit (id, date_of_visit, disease_id) VALUES (1, '2019-02-23', 1);

INSERT INTO medial_treatment (id, name, description, visit_id, physiotherapist_id) VALUES (1, 'Cwiczenia czynne', 'Podciaganie na lewej rece', 1, 1);
