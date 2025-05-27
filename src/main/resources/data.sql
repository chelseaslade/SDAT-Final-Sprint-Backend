REPLACE INTO health_condition (condition_name, condition_description, condition_type, condition_effect, is_curable, duration, frequency) VALUES
('Food Poisoning', 'A temporary illness from consuming bad food', 'Temporary', -8, true, 1, 0.2),
('Common Cold', 'A mild viral infection causing sneezing and congestion', 'Temporary', -5, true, 2, 0.1),
('Flu', 'A more severe viral infection with fever and fatigue', 'Temporary', -10, true, 3, 0.08),
('Asthma', 'A chronic respiratory condition', 'Chronic', -15, false, 0, 0.05);

REPLACE INTO event (event_name, event_type, event_description, require_user_response, event_stat_effect, event_effect_num, event_frequency) VALUES
('Car Accident', 'Negative', 'You were involved in a minor car accident.', true, 'health',-10, 0.02),
('Winning Lottery', 'Positive', 'You won a small lottery prize!', false, 'money', 500, 0.03),
('House Fire', 'Negative', 'Your house caught fire. You lost some valuable items.', false, 'money', -1000, 0.02);

REPLACE INTO education (education_level, education_type, education_requirements, education_length) VALUES
('College', 'Carpentry', 'High School', 2),
('University', 'Biochemistry', 'High School', 4),
('College', 'Office Administration', 'High School', 2),
('Certificate', 'First Aid/CPR', 'None', 0.25);

REPLACE INTO trait (trait_name, trait_description, trait_type, trait_effect_num) VALUES
('Hardy', 'You have above-average resistance to health conditions.', 'Health', null),
('Beautiful', 'You are incredibly attractive!', 'Appearance', 20),
('Genius', 'You are a genius!', 'Intelligence', 20),
('Rich Family', 'You come from a wealthy family and inherited a small fortune.', 'Money', 5000);

REPLACE INTO career (career_title, salary, education_requirements) VALUES
('Secretary', 35000, 'Office Administration'),
('Janitor', 20000, 'None'),
('Cashier', 18000, 'None'),
('Carpenter', 50000, 'Carpentry');