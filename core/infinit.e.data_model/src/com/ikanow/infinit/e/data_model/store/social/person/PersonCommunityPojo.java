/*******************************************************************************
 * Copyright 2012 The Infinit.e Open Source Project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.ikanow.infinit.e.data_model.store.social.person;

import java.util.Set;

import org.bson.types.ObjectId;

import com.ikanow.infinit.e.data_model.store.BaseDbPojo;
import com.ikanow.infinit.e.data_model.store.social.community.CommunityPojo;

public class PersonCommunityPojo extends BaseDbPojo 
{
	private ObjectId _id = null;
	private String name = null;
	private CommunityPojo.CommunityType type = null;
	private Set<ObjectId> derived = null; // (for data groups that belong because of user group membership)
	
	public PersonCommunityPojo()
	{
		
	}
	
	public PersonCommunityPojo(ObjectId id, String _name)
	{
		_id = id;
		name = _name;
	}
	
	/**
	 * @param _id the _id to set
	 */
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	/**
	 * @return the _id
	 */
	public ObjectId get_id() {
		return _id;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	public Set<ObjectId> getDerived() {
		return derived;
	}

	public void setDerived(Set<ObjectId> derived) {
		this.derived = derived;
	}

	public CommunityPojo.CommunityType getType() {
		return (null == type) ? CommunityPojo.CommunityType.data : type;
	}

	public void setType(CommunityPojo.CommunityType type) {
		this.type = type;
	}	
	
}
