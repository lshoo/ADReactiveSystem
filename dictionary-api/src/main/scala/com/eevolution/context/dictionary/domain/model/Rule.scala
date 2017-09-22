package com.eevolution.context.dictionary.domain.model
import org.joda.time.DateTime

/**
  * Copyright (C) 2003-2017, e-Evolution Consultants S.A. , http://www.e-evolution.com
  * This program is free software: you can redistribute it and/or modify
  * it under the terms of the GNU General Public License as published by
  * the Free Software Foundation, either version 3 of the License, or
  * (at your option) any later version.
  * This program is distributed in the hope that it will be useful,
  * but WITHOUT ANY WARRANTY; without even the implied warranty of
  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  * GNU General Public License for more details.
  * You should have received a copy of the GNU General Public License
  * along with this program.  If not, see <http://www.gnu.org/licenses/>.
  * Email: victor.perez@e-evolution.com, http://www.e-evolution.com , http://github.com/e-Evolution
  * Created by victor.perez@e-evolution.com , www.e-evolution.com on 18/02/17.
  */

/**
  * Rule Entity
  * @param ruleId
  * @param tenantId
  * @param organizationId
  * @param accessLevel
  * @param value
  * @param name
  * @param description
  * @param help
  * @param entityType
  * @param eventType
  * @param ruleType
  * @param script
  * @param isActive
  * @param created
  * @param createdBy
  * @param updated
  * @param updatedBy
  */
case class Rule (ruleId: Int,
                 tenantId : Int,
                 organizationId : Int,
                 accessLevel : Option[String] ,
                 value : String ,
                 name: String,
                 description: Option[String],
                 help: Option[String],
                 entityType: String =  EntityType.Dictionary ,
                 eventType : String ,
                 ruleType : String ,
                 script : String ,
                 isActive : Boolean = true,
                 created : DateTime = DateTime.now(),
                 createdBy : Int ,
                 updated :Int ,
                 updatedBy : DateTime = DateTime.now()) {

  def Identity = "AD_Rule_ID"
}
