/**
 * REST-контролер для керування таксі.
 * Реалізує REST API для клієнтів.
 */
@RestController
@RequestMapping("/api/taxi")
public class TaxiController {

    /**
     * Повертає список доступних таксі.
     *
     * @return список обʼєктів Taxi
     */
    @GetMapping("/available")
    public List<Taxi> getAvailableTaxis() { ... }
}
