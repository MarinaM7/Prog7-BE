# Prog7-BE

Sistema elettronico di rilevamento incendi che utilizza la rete internet HTTP per segnalare, ad un centro di assistenza remoto, la presenza di un incendio.
La sonda e il processo che è costantemente in ascolto su essa per captare il segnale di incendio.

Il processo di controllo sonde puo gestire piu sonde e comunicare gli allarmi al centro di controllo.

Nel centro di controllo troviamo le componenti che operano le operazioni necessarie per allertare il personale competente del pericolo. Le info che devono essere disponibili al personale competente devono essere coordinate geografiche (lat e longit) della soonda e la quantità di fumo percepita. Se il livello è maggiore di 5 scatta l'allarme.
