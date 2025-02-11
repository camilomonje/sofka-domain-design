package domain.tratamiento.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.tratamiento.valueobject.CitaId;

public class CitaConfirmada extends DomainEvent {

    private final CitaId citaId;

    public CitaConfirmada(CitaId citaId) {
        super("tratamiento.citaconfirmada");
        this.citaId = citaId;
    }

    public CitaId getCitaId() {
        return citaId;
    }
}
