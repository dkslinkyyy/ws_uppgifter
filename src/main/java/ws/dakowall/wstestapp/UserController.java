package ws.dakowall.wstestapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class UserController {

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {

        // boolean deleted = userService.deleteUser(id);
        // har inte än userService men det skulle isåfall se ut något som det ovan
        //temporär lösning nedandöfr
        boolean deleted = true;

        if (deleted) {
            return ResponseEntity.ok().build(); // 200 ok
        } else {
            //om ingen user hittas (deleted = false) returnernar vi att användaren inte har hittats
            //man kan också skicka ett error meddelande som talar om att användaren inte hittats
            //för att om man bara skickar en status kod, så säger det inte så mycket, blir svårt att debugga.

            return ResponseEntity.status(404).build(); // 404 not found
        }
    }

}
