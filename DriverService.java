/**
 * Сервіс для роботи з водіями.
 * Забезпечує CRUD-операції над сутністю Driver.
 */
public class DriverService {

    /**
     * Повертає список всіх водіїв.
     *
     * @return список обʼєктів Driver
     */
    public List<Driver> getAllDrivers() { ... }

    /**
     * Створює нового водія.
     *
     * @param driver обʼєкт Driver для створення
     * @return створений Driver
     */
    public Driver createDriver(Driver driver) { ... }
}