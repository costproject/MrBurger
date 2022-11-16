DROP DATABASE MrBurger;
CREATE DATABASE MrBurger;
USE MrBurger;

#Create Items
CREATE TABLE Items 	(
					Item_Id varchar(10) NOT NULL PRIMARY KEY,
                    Item_Name varchar(30),
                    Price int,
                    Quantity int
					);
                    
#create login
CREATE TABLE login 	(
					UserName varchar(10) NOT NULL PRIMARY KEY,
                    Password varchar(10)
					);

#Create Customer
CREATE TABLE Customer 	(
						Cust_Id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
                        Cust_Name varchar(30),
                        Email varchar(20),
                        Mobile_No varchar(10)
						);

#Create Orders
CREATE TABLE Orders 	(
					Order_Id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
					Cust_Id int,
					Date varchar(10),
                    Time varchar(10),
                    Sub_Total int,
                    Discount int,
                    Grand_Total int
                 #   FOREIGN KEY Customer(Cust_Id) REFERENCES Orders(Cust_Id)
                    );
                    
#Create Ordered_Items
CREATE TABLE Ordered_Items 	(
							Order_Id int,
                            Item_Id varchar(10),
                            Price int,
                            Quantity int,
                            Amount int,
                            PRIMARY KEY (Order_Id,Item_Id)
            #                FOREIGN KEY Items(Item_Id)REFERENCES Ordered_Items(Item_Id),
           #                 FOREIGN KEY Orders(Order_Id) REFERENCES Ordered_Items(Order_Id)
                            );
#SHOW TABLES;
#DESCRIBE Customer;
#DESCRIBE Items;
#DESCRIBE Orders;
#DESCRIBE Ordered_Items;

#Insert Login Info
INSERT INTO Login Values 	('admin','admin'),
							('','');

#Insert Burger Details
INSERT INTO Items(Item_Id, Item_Name, Price, Quantity)
	VALUES	('BUR001','Chicken Burger', 500,50),
			('BUR002','Beef Burger',600,10),
            ('BUR003','Crispy Chicken Burger',700,30),
            ('BUR004','Chicken Cheese Burger',700,40),
            ('BUR005','Creamy Mushroom Burger',700,10),
            ('BUR006','Grilled - Prawn Burger',800,20);
            
#Insert Appetizers Details
INSERT INTO Items(Item_Id, Item_Name, Price, Quantity)
	VALUES	('APP001','French Fries', 200,60),
			('APP002','Chicken Wings',250,50),
            ('APP003','Cheese Garlic Bread',200,20),
            ('APP004','Onion Rings',100,10),
            ('APP005','Cheese Sticks',150,10);

#Insert Desserts Details
INSERT INTO Items(Item_Id, Item_Name, Price, Quantity)
	VALUES	('DES001','Soft Drinks', 200,20),
			('DES002','Chocolate Milkshake',250,30),
            ('DES003','Faluda',250,20),
            ('DES004','Passion',150,10);

#Insert Beverages Details
INSERT INTO Items(Item_Id, Item_Name, Price, Quantity)
	VALUES	('BEV001','Cheese Cake', 550,8),
			('BEV002','Chocolate Cupcake',200,25),
            ('BEV003','Lava Cake',540,10),
            ('BEV004','Honey Waffle',740,10);

#SELECT * FROM Items;






