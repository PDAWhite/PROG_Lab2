package moves;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class Confide extends StatusMove{
	public Confide(){
		super(Type.NORMAL, 0, 100);
	}
	@Override
	protected void applyOppEffects(Pokemon p){
		super.applyOppEffects(p);
		p.setMod(Stat.SPECIAL_ATTACK, -1);
	}
	@Override
	protected String describe(){
		return "использует Confide.";
	}
}