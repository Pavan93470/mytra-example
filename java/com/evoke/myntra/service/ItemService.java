package com.evoke.myntra.service;

import java.util.List;

import com.evoke.myntra.dto.ItemDto;

public interface ItemService {

	public ItemDto create(ItemDto item);

	public List<ItemDto> getAll();

	public ItemDto update(ItemDto itemDto);

	public Boolean delete(Long id);

	public ItemDto getById(Long id);

	public ItemDto assignPriceToItem(Long itemId, Long priceId);

	public ItemDto updateProduct(ItemDto itemDto, Long id);
}
