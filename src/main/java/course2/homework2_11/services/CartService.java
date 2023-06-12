package course2.homework2_11.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CartService {
    private final List<Integer> storage = new ArrayList<>();

    public void add(List<Integer> ids) {
        storage.addAll(ids);
    }
    public List<Integer> get() {
        return Collections.unmodifiableList(storage);
    }
}
