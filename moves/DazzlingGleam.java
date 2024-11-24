package moves;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DazzlingGleam extends SpecialMove{
	public DazzlingGleam(){
		super(Type.FAIRY, 80, 100);
	}
	
	@Override
	protected String describe(){
		return "Использует Dazzling Gleam.";
	}
}