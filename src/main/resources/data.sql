INSERT INTO Roles (ROLENAME, TEAMSEDITALLOWED, USERSEDITALLOWED, PROJECTSEDITALLOWED)
VALUES ('CEO', 1, 1, 1),
       ('Team Lead', 0, 1, 1),
       ('Developer', 0, 0, 0),
       ('Unassigned', 0, 0, 0);

INSERT INTO USERS (USERNAME, PASSWORD, FIRSTNAME, LASTNAME, ROLEID)
VALUES ('angel', 'zhelyazkov', 'Angel', 'Zhelyazkov', 1),
       ('test', 'test', 'Test', 'Tester', 3);

INSERT INTO Teams (TEAMNAME)
VALUES ('Team Name 1');