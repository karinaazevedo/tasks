class UrlMappings {

	static mappings = {
		
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller:"Task")
        "500"(view:'/error')
	}
}
