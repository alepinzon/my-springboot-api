package io.foo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RestController(value = "foo")
public class FooController {

    @GetMapping(produces = APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(OK)
    public FooResource get(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new FooResource("Hello " + name);
    }
}
