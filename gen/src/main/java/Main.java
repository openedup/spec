import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.parser.OpenAPIV3Parser;
import io.swagger.v3.oas.models.OpenAPI;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Stream;

public class Main {

    public static void main(String... args) {

        OpenAPI openAPI = new OpenAPIV3Parser().read("v1/spec.yaml");

        Stream<Map.Entry<String, Schema>> schemas = openAPI.getComponents().getSchemas().entrySet().stream();

        schemas.forEach(s -> {
            System.out.println(s.getValue());
        });
    }

}
