package miage.m1.dice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class DiceController {

    @Autowired
    private DiceService diceService;


    @GetMapping("/rollDice")
    public Integer rollDice() {
        return this.diceService.roll(1).get(0);
    }

    @GetMapping("/rollDices/{x}")
    public List<Integer> rollDices(@PathVariable Optional<String> x) {
        if (x.isEmpty()) {
            return this.diceService.roll(1);
        }
        if(!x.get().matches("\\d+")) {
            throw new IllegalArgumentException("Invalid dice count");
        }
        return this.diceService.roll(Integer.parseInt(x.get()));
    }

    @GetMapping("/diceLogs")
    public List<DiceRollLog> getRollLogs() {
        return this.diceService.getRollLogs();
    }
}
