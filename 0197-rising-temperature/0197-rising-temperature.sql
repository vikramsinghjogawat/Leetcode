select w2.id
from Weather w1 join Weather w2 on w1.recordDate = ADDDATE(w2.recordDate,-1)
where w1.temperature<w2.temperature;