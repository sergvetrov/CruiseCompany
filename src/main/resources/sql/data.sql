INSERT INTO `roles` (`code`, `name`) VALUES ('admin', 'Administrator');
INSERT INTO `roles` (`code`, `name`) VALUES ('user', 'Customer');
INSERT INTO `roles` (`code`, `name`) VALUES ('no_role', 'Undefined');

INSERT INTO `status` (`status`) VALUES ('available');
INSERT INTO `status` (`status`) VALUES ('sold');
INSERT INTO `status` (`status`) VALUES ('no_status');

INSERT INTO `cruise` (`name`, `start`, `duration`, `passengers_capacity`)
VALUES ('Test Cruise', '2022-12-25 15:20:00', '20:00:00', 300);

INSERT INTO `stuff` (`name`, `surname`, `position`, `cruise_id`)
VALUES ('John', 'Smith', 'Cruise Director', 1);
INSERT INTO `stuff` (`name`, `surname`, `position`, `cruise_id`)
VALUES ('Nikolay', 'Popov', 'Cook', 1);

INSERT INTO `users` (`name`, `surname`, `email`, `password`, `role_id`, `wallet`, `has_document`)
VALUES ('Test', 'Userov', 'test_user@gmail.com', '123andrey', 'user' , 100, 0);
INSERT INTO `users` (`name`, `surname`, `email`, `password`, `role_id`)
VALUES ('Admin', 'Adminov', 'test_admin@gmail.com', '123admin', 'admin');

INSERT INTO `tickets` (`price`, `status_id`, `user_id`, `cruise_id`)
VALUES ('500.25', 'sold', 1, 1);
INSERT INTO `tickets` (`price`, `status_id`, `user_id`, `cruise_id`)
VALUES ('777.77', 'available', null, 1);

INSERT INTO `ports` (`name`, `arrival_time`, `departure_time`)
VALUES ('New Castle', '2022-12-24 15:20:00', '2022-12-25 15:20:00');
INSERT INTO `ports` (`name`, `arrival_time`, `departure_time`)
VALUES ('Costa Rica', '2023-01-15 14:00:00', '2023-01-17 14:00:00');

INSERT INTO `cruise_ports` (`cruise_id`, `port_id`) VALUES (1, 1);
INSERT INTO `cruise_ports` (`cruise_id`, `port_id`) VALUES (1, 2);