package facade.pattern.repository;

import facade.pattern.entity.Transfer;

import java.util.List;

public class TransferRepositoryImpl implements TransferRepository{
    @Override
    public void insert(Transfer transfer) {
        // do some sql here
        System.out.println(transfer);
    }

    @Override
    public List<Transfer> selectAll() {
        return null;
    }

    @Override
    public Transfer select(String id) {
        return null;
    }
}
