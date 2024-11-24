package moves;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import java.util.Random;

public class ShadowBall extends SpecialMove{
	public ShadowBall(){
		super(Type.GHOST, 80, 100);
	}
	@Override
	protected void applyOppEffects(Pokemon p){
		super.applyOppEffects(p);
		Random rand = new Random();
		if (rand.nextDouble() < 0.2){
			p.setMod(Stat.SPECIAL_DEFENSE, -1);
		}
	}
	@Override
	protected String describe(){
		return "использует Shadow Ball.";
	}
}