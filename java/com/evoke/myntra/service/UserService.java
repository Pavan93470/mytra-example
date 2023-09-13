package com.evoke.myntra.service;

import java.util.List;

import com.evoke.myntra.dto.UserDto;

public interface UserService {
	public UserDto create(UserDto userdto);

	public List<UserDto> getAll();

	public UserDto update(UserDto userDto);

	public Boolean delete(Long id);

	public UserDto getById(Long id);

	public UserDto assignCartToPerson(Long cartid, Long userid);

	public UserDto assignAddressToUser(Long addressId, Long UserId);

}
