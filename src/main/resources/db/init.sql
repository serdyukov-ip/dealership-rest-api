CREATE TABLE CarBrand (
                          id SERIAL PRIMARY KEY,
                          name VARCHAR(255) NOT NULL
);

CREATE TABLE CarModel (
                          id SERIAL PRIMARY KEY,
                          brand_id INT REFERENCES CarBrand(id),
                          name VARCHAR(255) NOT NULL
);

CREATE TABLE Managers (
                          id SERIAL PRIMARY KEY,
                          last_name VARCHAR(255) NOT NULL,
                          first_name VARCHAR(255) NOT NULL,
                          phone_number VARCHAR(20) NOT NULL
);

CREATE TABLE Events (
                        id SERIAL PRIMARY KEY,
                        name VARCHAR(255) NOT NULL
);


CREATE TABLE Cars (
                      id SERIAL PRIMARY KEY,
                      brand_id INT REFERENCES CarBrand(id),
                      model_id INT REFERENCES CarModel(id),
                      vin VARCHAR(17) NOT NULL
);

CREATE TABLE CarEvents (
                           id SERIAL PRIMARY KEY,
                           car_id INT REFERENCES Cars(id),
                           event_id INT REFERENCES Events(id),
                           manager_id INT REFERENCES Managers(id),
                           operation_date DATE NOT NULL
);


INSERT INTO CarBrand (name)
VALUES
    ('Toyota'), ('Honda'), ('Ford'), ('Chevrolet'), ('BMW'), ('Audi'),
    ('Mercedes-Benz'), ('Nissan'), ('Hyundai'), ('Kia'), ('Volkswagen'), ('Porsche'),
    ('Jeep'), ('Mitsubishi'), ('Subaru'), ('Lexus'), ('Mazda'), ('Acura'),
    ('Infiniti'), ('Lamborghini'), ('Ferrari'), ('Bugatti'), ('Rolls-Royce'), ('Land Rover'),
    ('Jaguar'), ('Maserati'), ('Aston Martin'), ('McLaren'), ('Tesla'), ('Volvo'), ('Cadillac');


INSERT INTO CarModel (brand_id, name)
VALUES
    (1, 'Corolla'), (1, 'Camry'), (1, 'RAV4'), (2, 'Civic'), (2, 'Accord'), (2, 'CR-V'),
    (3, 'Mustang'), (3, 'F-150'), (3, 'Explorer'), (4, 'Silverado'), (4, 'Equinox'), (4, 'Suburban'),
    (5, '3 Series'), (5, '5 Series'), (5, '7 Series'), (6, 'A4'), (6, 'Q5'), (6, 'S5'),
    (7, 'C-Class'), (7, 'E-Class'), (7, 'S-Class'), (8, 'Altima'), (8, 'Rogue'), (8, 'Maxima'),
    (9, 'Sonata'), (9, 'Elantra'), (9, 'Tucson'), (10, 'Optima'), (10, 'Sorento'), (10, 'Rio');


INSERT INTO Managers (last_name, first_name, phone_number)
VALUES
    ('Smith', 'John', '1234567890'),
    ('Johnson', 'Emma', '2345678901'),
    ('Williams', 'Michael', '3456789012'),
    ('Brown', 'Sophia', '4567890123'),
    ('Jones', 'Jacob', '5678901234'),
    ('Miller', 'Isabella', '6789012345'),
    ('Davis', 'Ethan', '7890123456'),
    ('Garcia', 'Olivia', '8901234567'),
    ('Rodriguez', 'Alexander', '9012345678'),
    ('Wilson', 'Ava', '0123456789');


INSERT INTO Cars (brand_id, model_id, vin)
VALUES
    (1, 1, '1HGCM82633A123456'),
    (1, 2, '1HGCM82633A123457'),
    (1, 3, '1HGCM82633A123458'),
    (2, 4, '1HGCM82633A123459'),
    (2, 5, '1HGCM82633A123460'),
    (2, 6, '1HGCM82633A123461'),
    (3, 7, '1HGCM82633A123462'),
    (3, 8, '1HGCM82633A123463'),
    (3, 9, '1HGCM82633A123464'),
    (4, 10, '1HGCM82633A123465');

INSERT INTO Events (name)
VALUES
    ('The car arrived at the showroom'),
    ('The car was sent to another dealership'),
    ('Car sold');


INSERT INTO CarEvents (car_id, event_id, manager_id, operation_date)
VALUES
    (1, 1, 1, '2022-01-01'),
    (2, 2, 2, '2022-01-02'),
    (3, 3, 3, '2022-01-03'),
    (4, 1, 4, '2022-01-04'),
    (5, 2, 5, '2022-01-05'),
    (6, 3, 6, '2022-01-06'),
    (7, 1, 7, '2022-01-07'),
    (8, 2, 8, '2022-01-08'),
    (9, 3, 9, '2022-01-09'),
    (10, 1, 10, '2022-01-10');