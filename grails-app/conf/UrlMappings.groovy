class UrlMappings {

	static mappings = {
	"/task/listByProperty/$propertyName?(.$format)/$propertyValue?(.$format)"{
            constraints{
                //propertyName(matches: /^\w$/)
            }
        }
		
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

<<<<<<< HEAD
        "/"(controller:"Task")
=======
        "/"(controller:"task")
>>>>>>> origin/master
        "500"(view:'/error')
	}
}
