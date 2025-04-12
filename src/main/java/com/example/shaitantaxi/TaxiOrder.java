package com.example.shaitantaxi;

public class TaxiOrder {
    private Region startRegion;
    private Region endRegion;
    private String carType;
    private String paymentMethod;
    private boolean childSeat;
    private boolean petTransport;
    private boolean afterParty;
    private int numPeople;

    public TaxiOrder(Region startRegion, Region endRegion, String carType, String paymentMethod, boolean childSeat, boolean petTransport, boolean afterParty, int numPeople) {
        this.startRegion = startRegion;
        this.endRegion = endRegion;
        this.carType = carType;
        this.paymentMethod = paymentMethod;
        this.childSeat = childSeat;
        this.petTransport = petTransport;
        this.afterParty = afterParty;
        this.numPeople = numPeople;
    }

    private static final Logger logger = LoggerFactory.getLogger(TaxiOrderService.class);

    public void createOrder(Order order) {
        logger.info("Створення нового замовлення: {}", order);

        try {
            // логіка створення замовлення
        } catch (Exception e) {
            logger.error("Помилка під час створення замовлення: {}", e.getMessage(), e);
            throw new OrderCreationException("Не вдалося створити замовлення. Код помилки: ERR-101");
        }
    }


    public Region getStartRegion() {
        return startRegion;
    }

    public Region getEndRegion() {
        return endRegion;
    }

    public String getCarType() {
        return carType;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public boolean isChildSeat() {
        return childSeat;
    }

    public boolean isPetTransport() {
        return petTransport;
    }

    public boolean isAfterParty() {
        return afterParty;
    }

    public int getNumPeople() {
        return numPeople;
    }
}
