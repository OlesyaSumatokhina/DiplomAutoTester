package dataBase;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.ObjectInputFilter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Credit {
    public ObjectInputFilter.Status status;
}