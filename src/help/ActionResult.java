package help;

public record ActionResult(IActor actor, INamed object, ActionType actionType) {
}