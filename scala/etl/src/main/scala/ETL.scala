object ETL {
    
    def transform(data : Map[Int, Seq[String]]) = data.flatMap{ 
        case (value, seq) => 
            seq.map( word => word.map(_.toLower) -> value)
    }
    
}

