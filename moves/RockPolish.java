package moves;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class RockPolish extends StatusMove{
	public RockPolish(){
		super(Type.ROCK, 0, 100);
	}
	@Override
	protected void applySelfEffects(Pokemon p){
		super.applySelfEffects(p);
		p.setMod(Stat.SPEED, 2);
	}
	@Override
	protected String describe(){
		return "использует Rock Polish.";
	}
}