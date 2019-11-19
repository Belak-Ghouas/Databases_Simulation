package Model;

public interface FileDescriptorModel {

	public void create();
	public int getNextBlock();
	public int addBlock(BlockModel block);
	public int removeBlock(BlockModel block);
	
}
