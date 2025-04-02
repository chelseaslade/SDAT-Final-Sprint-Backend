INSERT INTO health_condition (condition_name, condition_description, condition_type, condition_effect, is_curable, duration, frequency) VALUES
('Food Poisoning', 'A temporary illness from consuming bad food', 'Temporary', -8, true, 1, 0.2),
('Common Cold', 'A mild viral infection causing sneezing and congestion', 'Temporary', -5, true, 2, 0.1),
('Flu', 'A more severe viral infection with fever and fatigue', 'Temporary', -10, true, 3, 0.08),
('Asthma', 'A chronic respiratory condition', 'Chronic', -15, false, 0, 0.05);

INSERT INTO event () VALUES
                         ('Car Accident', 'Negative', 'You were involved in a minor car accident.', true, '-5 Health', 0.02),
                         ('Winning Lottery', 'Positive', 'You won a small lottery prize!', false, '+5000 Money', 0.01),
                         ('House Fire', 'Negative', 'Your house caught fire. You lost some valuable items.', false, '-2000 Money', 0.01),
                         ();