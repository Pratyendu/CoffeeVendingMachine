package implementations;

import enums.TypesOfCoffee;

import java.util.HashMap;
import java.util.Map;

public class Auditor {
    public static Map<TypesOfCoffee, AuditDetails> coffeeTypeAuditInfoMap = new HashMap<>();

    static void auditInfo(TypesOfCoffee type , float water , float milk , float beans, float price){
        if (coffeeTypeAuditInfoMap.containsKey(type)){
            AuditDetails auditDetails = coffeeTypeAuditInfoMap.get(type);
            auditDetails.totalPrice+=price;
            auditDetails.waterConsumed+=water;
            auditDetails.milkConsumed+=milk;
            auditDetails.beansConsumed+=beans;
        }else {
            coffeeTypeAuditInfoMap.put(type, new AuditDetails(price,milk,water,beans));
        }

    }
}
