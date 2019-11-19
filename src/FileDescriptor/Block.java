package FileDescriptor;

import Model.BlockModel;

public class Block implements BlockModel {
	
	private final int MX_SIZE=10;
	private static int  NumBlock;
	private String [] TabChar;
	
	public Block () {
		
		
	}
	
	

	public int getNumBlock() {
		return NumBlock;
	}

	public void setNumBlock(int numBlock) {
		NumBlock = numBlock;
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub
		NumBlock++;
		
	}

	@Override
	public BlockModel load(int NumBlock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void store(BlockModel block) {
		// TODO Auto-generated method stub
		
	}

}
