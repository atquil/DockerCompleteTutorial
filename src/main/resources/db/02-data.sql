-- Insert dummy data only if the table is empty
INSERT INTO CUSTOMER (full_name, email)
VALUES
    ('Rahul Dravid', 'rahul.wall@cricket.com'),
    ('Sachin Tendulkar', 'god@cricket.com'),
    ('MS Dhoni', 'captain.cool@cricket.com')
    ON CONFLICT (email) DO NOTHING;