package dk.rdpl.dih;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import dk.rdpl.dih.common.model.Inventory;
import dk.rdpl.dih.common.model.InventoryQuantity;
import dk.rdpl.dih.common.model.InventoryQuantity.MeasureEnum;

@Path("/inventory")
public class InventoryResource {

  @GET
  @Path("/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public Inventory inventory(@PathParam("id") String id) {
    Inventory inv = new Inventory();
    InventoryQuantity inventoryQuantity = new InventoryQuantity();
    inventoryQuantity.setCount(10);
    inventoryQuantity.setMeasure(MeasureEnum.KG);
    inv.setProductID("1");
    inv.setQuantity(inventoryQuantity);
    inv.setWarehouseID("12312312");
    return inv;
  }
}
