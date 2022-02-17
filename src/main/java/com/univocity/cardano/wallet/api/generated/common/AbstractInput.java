package com.univocity.cardano.wallet.api.generated.common;


import java.util.regex.*;
import java.math.*;
import java.util.*;
import static com.univocity.cardano.wallet.common.Utils.*;
import com.fasterxml.jackson.annotation.*;
import com.univocity.cardano.wallet.api.generated.stakepools.*;


public abstract class AbstractInput {


	@JsonProperty("address")
	private String address;

	@JsonProperty("amount")
	private Amount amount;

	@JsonProperty("assets")
	private ArrayList<AssetsInputsDelete> assets;

	@JsonProperty("id")
	private String id;

	@JsonProperty("index")
	private BigInteger index;

	/**
	 * Returns the address (optional).
	 * 
	 * A sequence of characters that encodes (in Base58 or Bech32) a sequence of bytes
	 * which represents an address on the Cardano blockchain.
	 * Sequences in Base58 encoding are expected to be legacy Byron addresses,
	 * whereas sequences in Bech32 encoding correspond to current Shelley addresses.
	 * For more details, see
	 * [CIP-0019 — Cardano addresses](https://github.com/cardano-foundation/CIPs/tree/master/CIP-0019)
	 * .
	 * 
	 * - Format: {@code base58|bech32}.
	 * 
	 * - Example: 
	 *   <pre>{@code addr1sjck9mdmfyhzvjhydcjllgj9vjvl522w0573ncustrrr2rg7h9azg4cyqd36yyd48t5ut72hgld0fg2xfvz82xgwh7wal6g2xt8n996s3xvu5g}</pre>
	 * 
	 * @return the address
	 */
	public String getAddress(){
		return address;
	}

	/**
	 * Defines the address (optional).
	 * 
	 * A sequence of characters that encodes (in Base58 or Bech32) a sequence of bytes
	 * which represents an address on the Cardano blockchain.
	 * Sequences in Base58 encoding are expected to be legacy Byron addresses,
	 * whereas sequences in Bech32 encoding correspond to current Shelley addresses.
	 * For more details, see
	 * [CIP-0019 — Cardano addresses](https://github.com/cardano-foundation/CIPs/tree/master/CIP-0019)
	 * .
	 * 
	 * - Format: {@code base58|bech32}.
	 * 
	 * - Example: 
	 *   <pre>{@code addr1sjck9mdmfyhzvjhydcjllgj9vjvl522w0573ncustrrr2rg7h9azg4cyqd36yyd48t5ut72hgld0fg2xfvz82xgwh7wal6g2xt8n996s3xvu5g}</pre>
	 * 
	 * @param address the address
	 */
	public void setAddress(String address){
		if (address == null) {
			this.address = address;
			return;
		}

		this.address = address;
	}

	/**
	 * Returns the amount (optional).
	 * 
	 * @return the amount
	 */
	public Amount getAmount(){
		return amount;
	}

	/**
	 * Defines the amount (optional).
	 * 
	 * @param amount the amount
	 */
	public void setAmount(Amount amount){
		if (amount == null) {
			this.amount = amount;
			return;
		}

		this.amount = amount;
	}

	/**
	 * Returns the flat list of assets (possibly empty). (optional).
	 * 
	 * @return the flat list of assets (possibly empty).
	 */
	public ArrayList<AssetsInputsDelete> getAssets(){
		return assets;
	}

	/**
	 * Defines a flat list of assets (possibly empty). (optional).
	 * 
	 * @param assets a flat list of assets (possibly empty).
	 */
	public void setAssets(ArrayList<AssetsInputsDelete> assets){
		if (assets == null) {
			this.assets = assets;
			return;
		}

		this.assets = assets;
	}

	/**
	 * Returns the unique identifier for this transaction.
	 * - Format: {@code hex}.
	 * - Length must be exactly {@code 64}.
	 * 
	 * - Example: 
	 *   <pre>{@code 1423856bc91c49e928f6f30f4e8d665d53eb4ab6028bd0ac971809d514c92db1}</pre>
	 * 
	 * @return the unique identifier for this transaction
	 */
	public String getId(){
		return id;
	}

	/**
	 * Defines a unique identifier for this transaction.
	 * - Format: {@code hex}.
	 * - Length must be exactly {@code 64}.
	 * 
	 * - Example: 
	 *   <pre>{@code 1423856bc91c49e928f6f30f4e8d665d53eb4ab6028bd0ac971809d514c92db1}</pre>
	 * 
	 * @param id a unique identifier for this transaction
	 */
	public void setId(String id){
		if (id == null) {
			throw new IllegalArgumentException("Value of id cannot be null");
		}

		if (id.codePointCount(0, id.length()) < 64) {
			throw new IllegalArgumentException("Length of id must have at least 64 characters, got '" + id.codePointCount(0, id.length()) + "'");
		}

		if (id.codePointCount(0, id.length()) > 64) {
			throw new IllegalArgumentException("Length of id cannot exceed 64 characters, got '" + id.codePointCount(0, id.length()) + "'");
		}

	    if(!Pattern.compile("\\p{XDigit}+").matcher(id).matches()){
    		throw new IllegalArgumentException("Value provided for id does not represent a hexadecimal.");
    	}

		this.id = id;
	}

	/**
	 * Returns the index.
	 * - Minimum value: {@code 0}.
	 * 
	 * @return the index
	 */
	public BigInteger getIndex(){
		return index;
	}

	/**
	 * Defines the index.
	 * - Minimum value: {@code 0}.
	 * 
	 * @param index the index
	 */
	public void setIndex(BigInteger index){
		if (index == null) {
			throw new IllegalArgumentException("Value of index cannot be null");
		}

		if (index.compareTo(new BigInteger("0")) < 0){
			throw new IllegalArgumentException("'" + index + "': value of index cannot be less than 0");
		}

		this.index = index;
	}

	@Override
	public String toString() {
		return printObject(this);
	}

}
