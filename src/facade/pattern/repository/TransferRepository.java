package facade.pattern.repository;

import facade.pattern.entity.Transfer;

import java.util.List;

public interface TransferRepository {
    public void insert(Transfer transfer);
    public List<Transfer> selectAll ();
    public Transfer select(String id);
}
