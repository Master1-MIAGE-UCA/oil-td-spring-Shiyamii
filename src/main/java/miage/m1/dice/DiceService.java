package miage.m1.dice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DiceService {

        @Autowired
        private DiceRollLogRepository diceRollLogRepository;
        private final Dice dice;

        public DiceService(Dice dice) {
            this.dice = dice;
        }

        public List<Integer>  roll(int diceCount) {
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < diceCount; i++) {
                result.add(dice.roll());
            }
            DiceRollLog diceRollLog = new DiceRollLog();
            diceRollLog.setDiceCount(diceCount);
            diceRollLog.setResults(result);
            diceRollLog.setTimestamp(System.currentTimeMillis());
            diceRollLogRepository.save(diceRollLog);
            return result;
        }
}
