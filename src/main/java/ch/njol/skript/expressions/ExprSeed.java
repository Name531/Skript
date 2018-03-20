/**
 *   This file is part of Skript.
 *
 *  Skript is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Skript is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Skript.  If not, see <http://www.gnu.org/licenses/>.
 *
 *
 * Copyright 2011-2017 Peter Güttinger and contributors
 */
package ch.njol.skript.expressions;

import ch.njol.skript.expressions.base.SimplePropertyExpression;
import org.bukkit.World;

public class ExprSeed extends SimplePropertyExpression<World, String> {

    static {
        register(ExprSeed.class, String.class, "seed[s]", "worlds");
    }

    @Override
    public String convert(World world) {
        return String.valueOf(world.getSeed());
    }

    @Override
    protected String getPropertyName() {
        return "seed";
    }

    @Override
    public Class<? extends String> getReturnType() {
        return String.class;
    }

}
