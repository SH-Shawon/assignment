# **Requirment:**
 -JDK-17

# **Process to run:**
-Pull to git and Run


# Insert Some Data to Database:

 -Copy and paste the following to MySQL Workbench and execute

INSERT INTO folder (name, parent_id) VALUES
('file-1', 1),
('file-2', 2),
('file-3', NULL),
('file-4', 3),
('file-5', NULL),
('file-6', 1),
('file-7', 1),
('file-8', 2),
('file-9', NULL),
('file-10', 3),
('file-11', 3),
('file-12', 4),
('file-13', 4),
('file-14', NULL),
('file-15', 5),
('file-16', 6),
('file-17', 7),
('file-18', 8),
('file-19', 10),
('file-20', 13);

# API
POST http://localhost:8080/api/v1/getidbyfolderid/1 run this from postman

## or 

POST http://localhost:8080/api/v1/getidbyfolderid/1
Content-Type: application/json
 run it from request.http file in project root directory