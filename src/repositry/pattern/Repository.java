package repositry.pattern;

import java.io.ObjectStreamException;
import java.util.List;

public interface Repository<t> {
    public void insert(t data);
    public void update(String id);
    public void delete(String id);
    public t select(String id);
    public List<t> selectAll ();
}
