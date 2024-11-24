package moves;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class SweetScent extends StatusMove{
	public SweetScent(){
		super(Type.NORMAL, 0, 100);
	}
	@Override
	protected void applyOppEffects(Pokemon p){
		super.applyOppEffects(p);
		p.setMod(Stat.EVASION, -1);
	}
	@Override
	protected String describe(){
		return "использует Sweet Scent.";
	}
}